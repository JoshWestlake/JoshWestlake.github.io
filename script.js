function toggleMenu1(){
    const menu = document.querySelector(".robotics-links");
    menu.classList.toggle("open");
}
function toggleMenu2(){
    const menu = document.querySelector(".robotics-links");
    menu.classList.toggle("open");
}

/*toggles the mode of the menu/hamburger which updates in html file -> causes the dropdown*/

/*toggles the mobile dropdown for the site-wide nav bar*/
function toggleSiteNav(){
    const links = document.getElementById("siteNavLinks");
    if (links) links.classList.toggle("open");
}

