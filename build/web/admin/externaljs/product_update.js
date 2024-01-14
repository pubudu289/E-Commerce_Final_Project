/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {


// Database Update 

    $("#btnUpdateAndPublish").click(function () {
        const productId = document.getElementById("txtproductid").value;


        const unit = document.getElementById("txtunit").value;
        const qty = document.getElementById("txtqty").value;
        var fileInput = document.getElementById('filethumb').value;
        const imageone = document.getElementById("fileone").value;
        const imagetwo = document.getElementById("filetwo").value;
        const imagethree = document.getElementById("filethree").value;
        const imagefour = document.getElementById("filefour").value;
        const description = document.getElementById("summernote").value;
        const unitprice = document.getElementById("txtunitPrice").value;
        const purchasePrice = document.getElementById("txtpurchaseprice").value;
        const discount = document.getElementById("txtdiscount").value;
        const txtflatrate = document.getElementById("txtflatrate").value;

        const mainCategory = document.getElementById("options").value;
        const subcategory = document.getElementById("subcat").value;
        const category = document.getElementById("category").value;
        const brand = document.getElementById("brand").value;
        const productName = document.getElementById("txtProductName").value;
          const shortdes = document.getElementById("shortdes").value;


        const flat = document.getElementById("toggFlatrate");
        if (flat.checked) {
            var frate = "2";
        } else {
            var frate = "0";
        }

        const  freeship = document.getElementById("txtfreeshipping");
        if (freeship.checked) {
            var fs = "1";
        } else {
            var fs = "0";
        }

        const flatrate = frate;
        const freeships = fs;
        const allone = flatrate + "" + freeships;


        var newid;
        switch (allone) {
            case "01":
                var newid = 1;
                break;
            case "20":
                var newid = 2;
                break;
            case "00":
                var newid = 0;
                break;
            default:
                break;
        }


        const lowstockqty = document.getElementById("txtlowstock").value;

        const shows = document.getElementById("showstock");
        if (shows.checked) {
            var sh = "1";
        } else {
            var sh = "0";
        }
        const stockwithtex = document.getElementById("stockwithtext");
        if (stockwithtex.checked) {
            var swt = "2";
        } else {
            var swt = "0";
        }

        const hstock = document.getElementById("hidestock");
        if (hstock.checked) {
            var hs = "3";
        } else {
            var hs = "0";
        }


        var ids = sh + "" + swt + "" + hs;

        var vidibility;
        switch (ids) {
            case "100":
                var vidibility = 1;
                break;
            case "020":
                var vidibility = 2;
                break;
            case "003":
                var vidibility = 3;
                break;
            case "000":
                var vidibility = 0;
                break;
            default:
                break;
        }


        const days = document.getElementById("txtdays").value;

        $.ajax({
            type: 'POST',
            url: "/Ecom_final_project/ProductUpdateController",

            data: {"productId": productId, "unit": unit, "qty": qty,
                "filethumb": fileInput, "imageone": imageone, "imagetwo": imagetwo,
                "imagethree": imagethree, "imagefour": imagefour,
                "description": description, "unitprice": unitprice,
                "purchasePrice": purchasePrice, "discount": discount,
                "shipping_status": newid, "quantity_warning": lowstockqty,
                "visibility": vidibility, "shipping_days": days,
                "txtflatrate": txtflatrate, "brand": brand, "mainCategory": mainCategory,
                "subcategory": subcategory, "category": category,
                "productName": productName,"shortdes":shortdes},
            success: function (data) {

                if (data === "00") {
                    swal("Good job!", "Product Update Successful!", "success")
                            .then((value) => {
                                if (value) {
                                    window.location.replace("/Ecom_final_project/admin/viewAllProduct.jsp");
                                }
                            });
                }
            },
            error: function () {

            }
        });
    });
});


$(document).ready(function () {
    $("#btnUpdateAndUnpublish").click(function () {
        const productId = document.getElementById("txtproductid").value;


        const unit = document.getElementById("txtunit").value;
        const qty = document.getElementById("txtqty").value;
        var fileInput = document.getElementById('filethumb').value;
        const imageone = document.getElementById("fileone").value;
        const imagetwo = document.getElementById("filetwo").value;
        const imagethree = document.getElementById("filethree").value;
        const imagefour = document.getElementById("filefour").value;
        const description = document.getElementById("summernote").value;
        const unitprice = document.getElementById("txtunitPrice").value;
        const purchasePrice = document.getElementById("txtpurchaseprice").value;
        const discount = document.getElementById("txtdiscount").value;
        const txtflatrate = document.getElementById("txtflatrate").value;

        const mainCategory = document.getElementById("options").value;
        const subcategory = document.getElementById("subcat").value;
        const category = document.getElementById("category").value;
        const brand = document.getElementById("brand").value;
        const productName = document.getElementById("txtProductName").value;
        const shortdes = document.getElementById("shortdes").value;



        const flat = document.getElementById("toggFlatrate");
        if (flat.checked) {
            var frate = "2";
        } else {
            var frate = "0";
        }

        const  freeship = document.getElementById("txtfreeshipping");
        if (freeship.checked) {
            var fs = "1";
        } else {
            var fs = "0";
        }

        const flatrate = frate;
        const freeships = fs;
        const allone = flatrate + "" + freeships;


        var newid;
        switch (allone) {
            case "01":
                var newid = 1;
                break;
            case "20":
                var newid = 2;
                break;
            case "00":
                var newid = 0;
                break;
            default:
                break;
        }


        const lowstockqty = document.getElementById("txtlowstock").value;

        const shows = document.getElementById("showstock");
        if (shows.checked) {
            var sh = "1";
        } else {
            var sh = "0";
        }
        const stockwithtex = document.getElementById("stockwithtext");
        if (stockwithtex.checked) {
            var swt = "2";
        } else {
            var swt = "0";
        }

        const hstock = document.getElementById("hidestock");
        if (hstock.checked) {
            var hs = "3";
        } else {
            var hs = "0";
        }


        var ids = sh + "" + swt + "" + hs;

        var vidibility;
        switch (ids) {
            case "100":
                var vidibility = 1;
                break;
            case "020":
                var vidibility = 2;
                break;
            case "003":
                var vidibility = 3;
                break;
            case "000":
                var vidibility = 0;
                break;
            default:
                break;
        }


        const days = document.getElementById("txtdays").value;

        $.ajax({
            type: 'POST',
            url: "/Ecom_final_project/ProductUpdateAndUnpublishController",

            data: {"productId": productId, "unit": unit, "qty": qty,
                "filethumb": fileInput, "imageone": imageone, "imagetwo": imagetwo,
                "imagethree": imagethree, "imagefour": imagefour,
                "description": description, "unitprice": unitprice,
                "purchasePrice": purchasePrice, "discount": discount,
                "shipping_status": newid, "quantity_warning": lowstockqty,
                "visibility": vidibility, "shipping_days": days,
                "txtflatrate": txtflatrate, "brand": brand, "mainCategory": mainCategory,
                "subcategory": subcategory, "category": category, "productName": productName,
                "shortdes": shortdes},
            success: function (data) {

                if (data === "00") {
                    swal("Good job!", "Product Update Successful!", "success")
                            .then((value) => {
                                if (value) {
                                    window.location.replace("/Ecom_final_project/admin/viewAllProduct.jsp");
                                }
                            });
                }
            },
            error: function () {

            }
        });
    });
});


$(document).ready(function () {
    $("#canclebtn").click(function () {

        swal({
            title: "Are you sure?",
            text: "Do you really want to cancle this product update process..?",
            icon: "warning",
            buttons: true,
            dangerMode: true,
        })
                .then((value) => {
                    if (value) {
                        window.location.replace("/Ecom_final_project/admin/viewAllProduct.jsp");
                    }
                });

    });
});