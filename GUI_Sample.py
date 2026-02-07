import sys
from PySide6.QtWidgets import (
    QApplication, QMainWindow, QWidget,
    QPushButton, QLabel, QPlainTextEdit,
    QVBoxLayout, QHBoxLayout, QFormLayout,
    QSpinBox
)
from PySide6.QtCore import Qt, QTimer
from backend import BackendManager

MAX_LOG_LINES = 30

class MainWindow(QMainWindow):
    def __init__(self):
        super().__init__()
        self.setWindowTitle("Vibration Monitoring GUI")
        self.resize(1200, 700)

        self.backend = BackendManager(self.add_log)

        self._build_ui()

    def _build_ui(self):
        root = QWidget()
        self.setCentralWidget(root)

        main_layout = QHBoxLayout(root)

        # ---------------- LEFT PANEL ----------------
        self.left_panel = QWidget()
        left_layout = QVBoxLayout(self.left_panel)

        logo = QLabel("LOGO")
        logo.setAlignment(Qt.AlignCenter)

        self.start_btn = QPushButton("Start")
        self.stop_btn = QPushButton("Stop")
        self.stop_btn.setEnabled(False)

        self.start_btn.clicked.connect(self.start_backend)
        self.stop_btn.clicked.connect(self.stop_backend)

        left_layout.addWidget(logo)
        left_layout.addWidget(self.start_btn)
        left_layout.addWidget(self.stop_btn)
        left_layout.addStretch()

        # ---------------- PARAM PANEL ----------------
        self.param_panel = QWidget()
        param_layout = QFormLayout(self.param_panel)

        self.threshold = QSpinBox()
        self.threshold.setRange(0, 100)
        self.threshold.setValue(50)

        param_layout.addRow("Threshold", self.threshold)

        # ---------------- LOG PANEL ----------------
        self.log_panel = QPlainTextEdit()
        self.log_panel.setReadOnly(True)
        self.log_panel.setMaximumBlockCount(MAX_LOG_LINES)
        self.log_panel.setStyleSheet("font-family: monospace;")

        # ---------------- ADD TO MAIN ----------------
        main_layout.addWidget(self.left_panel, 1)
        main_layout.addWidget(self.param_panel, 1)
        main_layout.addWidget(self.log_panel, 2)

    # ---------------- LOGIC ----------------
    def start_backend(self):
        self.backend.start()

        self.start_btn.setEnabled(False)
        self.stop_btn.setEnabled(True)

        self.param_panel.setVisible(False)

    def stop_backend(self):
        self.backend.stop()

        self.start_btn.setEnabled(True)
        self.stop_btn.setEnabled(False)

        self.param_panel.setVisible(True)

    def add_log(self, text):
        self.log_panel.appendPlainText(text)
        self.log_panel.verticalScrollBar().setValue(
            self.log_panel.verticalScrollBar().maximum()
        )

if __name__ == "__main__":
    app = QApplication(sys.argv)
    win = MainWindow()
    win.show()
    sys.exit(app.exec())
