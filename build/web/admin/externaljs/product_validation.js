/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    $('#summernote').summernote({
        height: 200, // set editor height
        minHeight: null, // set minimum height of editor
        maxHeight: null, // set maximum height of editor
        focus: true // set focus to editable area after initializing summernote
    });

    //Initialize Select2 Elements
    $('.select2bs4').select2({
        theme: 'bootstrap4'
    });
});

function FreeShip() {
    var flat = document.getElementById("toggFlatrate");
    flat.checked = false;


    var flats = document.getElementById("flatrate");
    if (flats.style.display === "block") {
        flats.style.display = "none";
    }

}
function flatrate() {
    var freeship = document.getElementById("txtfreeshipping");
    freeship.checked = false;

    var flats = document.getElementById("flatrate");
    if (flats.style.display === "none") {
        flats.style.display = "block";
    } else {
        flats.style.display = "none";
    }

}


function showstock() {
    var stt = document.getElementById("stockwithtext");
    var hid = document.getElementById("hidestock");
    stt.checked = false;
    hid.checked = false;
}
function stockwithtext() {
    var ss = document.getElementById("showstock");
    var hid = document.getElementById("hidestock");
    ss.checked = false;
    hid.checked = false;
}
function hidestock() {
    var ss = document.getElementById("showstock");
    var stt = document.getElementById("stockwithtext");
    ss.checked = false;
    stt.checked = false;
}




const  purchasePrice = document.getElementById("txtpurchaseprice");
purchasePrice.addEventListener("input", purPrice);
function purPrice(e) {
    if (purchasePrice.value.trim("").length === 0) {
        document.getElementById("discountPrice").innerHTML = "0.00";
    } else {
        var purchasePr = document.getElementById("txtpurchaseprice").value;
        var  disByPr = document.getElementById("txtdiscount").value;
       
        var pricebyDis = purchasePr - (purchasePr * disByPr) / 100;
        
        
        document.getElementById("discountPrice").innerHTML = pricebyDis.toFixed(2);

    }
}


const  discountByPrice = document.getElementById("txtdiscount");
discountByPrice.addEventListener("input", updatePrice);
function updatePrice(e) {
    if (discountByPrice.value.trim("").length === 0) {
        document.getElementById("discountPrice").innerHTML = "0.00";
    } else {
        var purchasePrice = document.getElementById("txtpurchaseprice").value;
        var  disByPrice = document.getElementById("txtdiscount").value;
       
        var pricebyDiscount = purchasePrice - (purchasePrice * disByPrice) / 100 ;
        document.getElementById("discountPrice").innerHTML = pricebyDiscount.toFixed(2);

    }
}
