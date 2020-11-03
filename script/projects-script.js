addNavHandlers();
addProjectCollapsibleHandlers();

console.log("js running");

//nav dropdown
function addNavHandlers() {
    console.log("nav handlers added");

    let openNavElement = document.querySelector('#navbar');
    let navContents = document.getElementById("navDrop");

    const navOpenHandler = function() {
        if (navContents.classList.contains('open')) {
            navContents.classList.remove('open');
        } else {
            navContents.classList.add('open');
        };
    };

    openNavElement.addEventListener('click', navOpenHandler);
}

//slideshow

let slideIndex = 1;
showSlides(); 

function plusSlides(n) {
    showSlides(slideIndex += n);
}

function currentSlide(n) {
    showSlides(slideIndex = n);
}

function showSlides(n) {
    var i;
    const slides = document.getElementsByClassName("slides");
    const dots = document.getElementsByClassName("dots");

    if (n > slides.length) {
        slideIndex = 1;
    }
    if (n < 1) {
        slideIndex = slides.length;
    }

    for (i = 0; i < slides.length; i++) {
        slides[i].style.display = "none";
    }

    for (i = 0; i < dots.length; i++) {
        dots[i].className = dots[i].className.replace(" active", " ");
    }

    slides[slideIndex-1].style.display = "block";
    dots[slideIndex-1].className += " active";
}


//collapsibles

function addProjectCollapsibleHandlers() {
    const reviewSite = document.querySelector("#reviews");
    const petShelter = document.querySelector("#pet-shelter");
    const virtualPet = document.querySelector("#virtual-pet");

    const reviewButton = document.querySelector("#review-button");
    const shelterButton = document.querySelector("#shelter-button");
    const petButton = document.querySelector("#pet-button");

    function openProjectDetails(project) {
        project.classList.toggle("expanded");

        switch(project) {
            case reviewSite:
                petShelter.classList.remove('expanded')
                virtualPet.classList.remove('expanded')
                break;
            case petShelter:
                reviewSite.classList.remove('expanded')
                virtualPet.classList.remove('expanded')
                break;
            case virtualPet:
                petShelter.classList.remove('expanded')
                reviewSite.classList.remove('expanded')
                break;
        }
    }

    reviewButton.addEventListener("click", function() {openProjectDetails(reviewSite)});
    shelterButton.addEventListener("click", function() {openProjectDetails(petShelter)});
    petButton.addEventListener("click", function() {openProjectDetails(virtualPet)});

} 