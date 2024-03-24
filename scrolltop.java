document.addEventListener("DOMContentLoaded", function() {
  var scrollButton = document.querySelector(".scroll-up");
  if (scrollButton) {
    scrollButton.addEventListener("click", function() {
      window.scrollTo({ top: 0, behavior: 'smooth' }); // Scroll to the top of the page smoothly
    });
  }
});
