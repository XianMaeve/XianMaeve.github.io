addModalHandlers()
addNavHandlers()

let slideIndex = 1;
showSlides();

console.log("js running");


//about me contact modal
function addModalHandlers() {
    console.log("modal handlers added");

    let openModalElement = document.querySelector("#modal-open");

    const modalOpenHandler = function() {
        document.body.classList.add('modal-active');
        console.log("function ran");
    };

    openModalElement.addEventListener('click', modalOpenHandler);

    const closeModalElement = document.querySelector("#close-modal");

    const modalCloseHandler = function() {
        document.body.classList.remove('modal-active');
        console.log('should close');
    }

    closeModalElement.addEventListener('click', modalCloseHandler)
}


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