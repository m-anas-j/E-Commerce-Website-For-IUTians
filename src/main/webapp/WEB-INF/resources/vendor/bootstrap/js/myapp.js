$(function () {
    //solving the active menu problem
    switch (menu) {
        case 'Contact Us':
            $('#contact').addClass('active');
            break;
        case 'About Us':
            $('#about').addClass('active');
            break;
        case 'Log In':
            $('#login').addClass('active');
            break;
        default:
            $('#home').addClass('active');
            break;
    }

});