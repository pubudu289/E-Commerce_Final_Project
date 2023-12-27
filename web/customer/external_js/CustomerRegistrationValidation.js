/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {

    $.ajax({
        type: 'POST',
        url: "/Ecom_final_project/LoadProvinceController",
        data: {},
        success: function (data) {

        },
        error: function () {

        }
    });

});

function ProvinceOptionClicked() {
    const provinceName = document.getElementById('txt_province').value;
    $.ajax({
        type: 'POST',
        url: "/Ecom_final_project/LoadMaincityController",
        data: {"provinceName": provinceName},
        success: function (data) {
            document.getElementById('txt_maincity').innerHTML = data;
        },
        error: function () {

        }
    });
}


//    Load options(Main City)
function MaincityOptionClicked() {
    const districtName = document.getElementById('txt_maincity').value;

    $.ajax({
        type: 'POST',
        url: "/Ecom_final_project/LoadHomecityController",
        data: {"districtName": districtName},
        success: function (data) {
            document.getElementById('homecity').innerHTML = data;
        },
        error: function () {

        }
    });


    $.ajax({
        type: 'POST',
        url: "/Ecom_final_project/LoadPostalCodeController",
        data: {"districtName": districtName},
        success: function (data) {
            document.getElementById('txt_postal').innerHTML = data;
        },
        error: function () {

        }
    });



}



$(document).ready(function () {
    $("#btnRegister").click(function () {

        const  email = document.getElementById("txtemail").value;
        const  fullname = document.getElementById("full_name").value;
        const  bday = document.getElementById("txtdob").value;

        var gender = $("input:radio[name=inlineRadioOptions]:checked").val();

        const  mobileNo = document.getElementById("txtmobile").value;
        const  country = document.getElementById("txtcountry").value;
        const province = document.getElementById("txt_province").value;
        const  maincity = document.getElementById("txt_maincity").value;
        const  homecity = document.getElementById("homecity").value;
        const  addlineone = document.getElementById("addlineone").value;
        const  addlinetwo = document.getElementById("addlinetwo").value;
        const  addlinethree = document.getElementById("addlinethree").value;
        const  postalcode = document.getElementById("txt_postal").value;

        const  name_error_fullname = document.getElementById("name_error_fullname");
        const  name_error_dob = document.getElementById("name_error_dob");
        const  name_error_mobile = document.getElementById("name_error_mobile");
        const  name_error_province = document.getElementById("name_error_province");
        const  name_error_maincity = document.getElementById("name_error_maincity");
        const  name_error_homecity = document.getElementById("name_error_homecity");
        const  name_error_addlineone = document.getElementById("name_error_addlineone");
        const  name_error_addlinetwo = document.getElementById("name_error_addlinetwo");
        const  name_error_postal = document.getElementById("name_error_postal");

        if (fullname.trim("") === '' || fullname.trim("") == null) {
            name_error_fullname.innerHTML = "*Full name is required";
        } else {
            var fname = fullname;
            name_error_fullname.innerHTML = "";
        }

        if (bday.trim("") === '' || bday.trim("") == null) {
            name_error_dob.innerHTML = "*Date of Birth is required";
        } else {
            var birthday = bday;
            name_error_dob.innerHTML = "";
        }
        if (mobileNo.trim("") === '' || mobileNo.trim("") == null) {
            name_error_mobile.innerHTML = "*Mobile Number is required";
        } else {
            var mob = mobileNo;
            name_error_mobile.innerHTML = "";
        }
        if (province.trim("") === '' || province.trim("") == null) {
            name_error_province.innerHTML = "*Province code is required";
        } else {
            var provi = province;
            name_error_province.innerHTML = "";
        }

        if (maincity.trim("") === '' || maincity.trim("") == null) {
            name_error_maincity.innerHTML = "*Main city is required";
        } else {
            var mcity = maincity;
            name_error_maincity.innerHTML = "";
        }
        if (homecity.trim("") === '' || homecity.trim("") == null) {
            name_error_homecity.innerHTML = "*Home city is required";
        } else {
            var hcity = homecity;
            name_error_homecity.innerHTML = "";
        }
        if (addlineone.trim("") === '' || addlineone.trim("") == null) {
            name_error_addlineone.innerHTML = "*Address line 1 is required";
        } else {
            var addline1 = addlineone;
            name_error_addlineone.innerHTML = "";
        }
        if (addlinetwo.trim("") === '' || addlinetwo.trim("") == null) {
            name_error_addlinetwo.innerHTML = "*Address line 2 is required";
        } else {
            var addline2 = addlinetwo;
            name_error_addlinetwo.innerHTML = "";
        }
        if (postalcode.trim("") === '' || postalcode.trim("") == null) {
            name_error_postal.innerHTML = "*Postal Code is required";
        } else {
            var pcode = postalcode;
            name_error_postal.innerHTML = "";
        }

        if (email && fname && birthday && mob && mcity && hcity && addline1 && addline2 && pcode && provi) {


            $.ajax({
                type: 'POST',
                url: "/Ecom_final_project/AddUserDetails",
                data: {"email": email, "fullname": fullname, "bday": bday,
                    "gender": gender, "mobileNo": mobileNo, "country": country,
                    "province": province, "maincity": maincity,
                    "homecity": homecity, "addlineone": addlineone,
                    "addlinetwo": addlinetwo, "addlinethree": addlinethree,
                    "postalcode": postalcode},
                success: function (data) {

                    if (data === "00") {
                        window.location.replace("/Ecom_final_project/customer/signin.jsp");
                    } else {
                        window.location.replace("/Ecom_final_project/customer/userRegister.jsp?=" + email);
                    }
                },
                error: function () {

                }
            });
        }




    });
});

const  fullname = document.getElementById("full_name");
const  bday = document.getElementById("txtdob");
const  mobileNo = document.getElementById("txtmobile");
const  country = document.getElementById("txtcountry");
const  province = document.getElementById("txt_province");
const  maincity = document.getElementById("txt_maincity");
const  homecity = document.getElementById("homecity");
const  addlineone = document.getElementById("addlineone");
const  addlinetwo = document.getElementById("addlinetwo");
const  postalcode = document.getElementById("txt_postal");

const  name_error_fullname = document.getElementById("name_error_fullname");
const  name_error_dob = document.getElementById("name_error_dob");
const  name_error_mobile = document.getElementById("name_error_mobile");
const  name_error_province = document.getElementById("name_error_province");
const  name_error_maincity = document.getElementById("name_error_maincity");
const  name_error_homecity = document.getElementById("name_error_homecity");
const  name_error_addlineone = document.getElementById("name_error_addlineone");
const  name_error_addlinetwo = document.getElementById("name_error_addlinetwo");
const  name_error_postal = document.getElementById("name_error_postal");

fullname.addEventListener("input", updateFullname);
function updateFullname(e) {
    if (fullname.value.trim("").length === 0) {
        name_error_fullname.innerHTML = "*Full name is required";
        name_error_fullname.style.color = "red";
        return;
    } else {
        name_error_fullname.innerHTML = "";
    }
}

bday.addEventListener("input", updateBday);
function updateBday(e) {
    if (bday.value.trim("").length === 0) {
        name_error_dob.innerHTML = "*Date of Birth is required";
        name_error_dob.style.color = "red";
        return;
    } else {
        name_error_dob.innerHTML = "";
    }
}


mobileNo.addEventListener("input", updateMobile);
function updateMobile(e) {
    if (mobileNo.value.trim("").length === 0) {
        name_error_mobile.innerHTML = "*Mobile Number is required";
        name_error_mobile.style.color = "red";
        return;
    } else {
        name_error_mobile.innerHTML = "";
    }
}

province.addEventListener("select", updateProvince);
function updateProvince(e) {
    if (province.value.trim("").length === 0) {
        name_error_province.innerHTML = "*Province is required";
        name_error_province.style.color = "red";
        return;
    } else {
        name_error_province.innerHTML = "";
    }
}

maincity.addEventListener("select", updateMaincity);
function updateMaincity(e) {
    if (maincity.value.trim("").length === 0) {
        name_error_maincity.innerHTML = "*Main city is required";
        name_error_maincity.style.color = "red";
        return;
    } else {
        name_error_maincity.innerHTML = "";
    }
}


homecity.addEventListener("select", updateHomecity);
function updateHomecity(e) {
    if (homecity.value.trim("").length === 0) {
        name_error_homecity.innerHTML = "*Home city is required";
        name_error_homecity.style.color = "red";
        return;
    } else {
        name_error_homecity.innerHTML = "";
    }
}


addlineone.addEventListener("input", updateAddlineone);
function updateAddlineone(e) {
    if (addlineone.value.trim("").length === 0) {
        name_error_addlineone.innerHTML = "*Address line 1 is required";
        name_error_addlineone.style.color = "red";
        return;
    } else {
        name_error_addlineone.innerHTML = "";
    }
}


addlinetwo.addEventListener("input", updateAddlinetwo);
function updateAddlinetwo(e) {
    if (addlinetwo.value.trim("").length === 0) {
        name_error_addlinetwo.innerHTML = "*Address line 2 is required";
        name_error_addlinetwo.style.color = "red";
        return;
    } else {
        name_error_addlinetwo.innerHTML = "";
    }
}


postalcode.addEventListener("select", updatePostalcode);
function updatePostalcode(e) {
    if (postalcode.value.trim("").length === 0) {
        name_error_postal.innerHTML = "*Postal Code is required";
        name_error_postal.style.color = "red";
        return;
    } else {
        name_error_postal.innerHTML = "";
    }
}