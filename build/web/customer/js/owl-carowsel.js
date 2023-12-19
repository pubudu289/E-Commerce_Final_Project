/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//feather.replace();
var owl = $('.owl-carousel');
owl.owlCarousel({
    items:4,
    loop:true,
    margin:10,
    autoplay:true,
    autoplayTimeout:2000,
    autoplayHoverPause:true,
    
    responsive: {
        0: {
            items: 5
        },
        600: {
            items:5
        },
        1000: {
            items: 7
        }
    }
});

owl.on('click',function(){
    owl.trigger('play.owl.autoplay',[1000]);
});

//owl.on('mousewheel', '.owl-stage', function (e) {
//    if (e.deltaY > 0) {
//        owl.trigger('next.owl');
//    } else {
//        owl.trigger('prev.owl');
//    }
//    e.preventDefault();
//});