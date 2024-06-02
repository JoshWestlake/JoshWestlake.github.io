document.addEventListener("DOMContentLoaded", function() {
    var readMoreLink = document.querySelector('.read-more-link');
    var additionalContent = document.querySelector('.additional-content');

    readMoreLink.addEventListener('click', function(event) {
        event.preventDefault(); // Prevent the default behavior of the link

        // Toggle the display of the additional content
        additionalContent.style.display = (additionalContent.style.display === 'none') ? 'block' : 'none';
    });
});