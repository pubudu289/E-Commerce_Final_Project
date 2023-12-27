/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



const selectImagethumb = document.getElementById("selct-imagethumb");

const inputFilethumb = document.getElementById("filethumb");
const imgAreathumb = document.getElementById("image-areathumb");

selectImagethumb.addEventListener('click', function () {
    inputFilethumb.click();
    

    
})

inputFilethumb.addEventListener('change', function () {
    const image = this.files[0]
    if (image.size < 2000000) {
        const reader = new FileReader();
        reader.onload = () => {
            const allImg = imgAreathumb.querySelectorAll('img');
            allImg.forEach(item => item.remove());
            const imgUrl = reader.result;
            const img = document.createElement('img');
            img.src = imgUrl;
            imgAreathumb.appendChild(img);
            imgAreathumb.classList.add('active');
            imgAreathumb.dataset.img = image.name;
        }
        reader.readAsDataURL(image);
    } else {
        alert("Image size more than 2MB");
    }
})





const selectImageone = document.getElementById("selct-imageone");
const inputFileone = document.getElementById("fileone");
const imgAreaone = document.getElementById("image-areaone");


selectImageone.addEventListener('click', function () {
    inputFileone.click();
})

inputFileone.addEventListener('change', function () {
    const image = this.files[0]
    if (image.size < 2000000) {
        const reader = new FileReader();
        reader.onload = () => {
            const allImg = imgAreaone.querySelectorAll('img');
            allImg.forEach(item => item.remove());
            const imgUrl = reader.result;
            const img = document.createElement('img');
            img.src = imgUrl;
            imgAreaone.appendChild(img);
            imgAreaone.classList.add('active');
            imgAreaone.dataset.img = image.name;
        }
        reader.readAsDataURL(image);
    } else {
        alert("Image size more than 2MB");
    }
})



const selectImagetwo = document.getElementById("selct-imagetwo");
const inputFiletwo = document.getElementById("filetwo");
const imgAreatwo = document.getElementById("image-areatwo");

selectImagetwo.addEventListener('click', function () {
    inputFiletwo.click();
})

inputFiletwo.addEventListener('change', function () {
    const image = this.files[0]
    if (image.size < 2000000) {
        const reader = new FileReader();
        reader.onload = () => {
            const allImg = imgAreatwo.querySelectorAll('img');
            allImg.forEach(item => item.remove());
            const imgUrl = reader.result;
            const img = document.createElement('img');
            img.src = imgUrl;
            imgAreatwo.appendChild(img);
            imgAreatwo.classList.add('active');
            imgAreatwo.dataset.img = image.name;
        }
        reader.readAsDataURL(image);
    } else {
        alert("Image size more than 2MB");
    }
})




const selectImagethree = document.getElementById("selct-imagethree");
const inputFilethree = document.getElementById("filethree");
const imgAreathree = document.getElementById("image-areathree");

selectImagethree.addEventListener('click', function () {
    inputFilethree.click();
})

inputFilethree.addEventListener('change', function () {
    const image = this.files[0]
    if (image.size < 2000000) {
        const reader = new FileReader();
        reader.onload = () => {
            const allImg = imgAreathree.querySelectorAll('img');
            allImg.forEach(item => item.remove());
            const imgUrl = reader.result;
            const img = document.createElement('img');
            img.src = imgUrl;
            imgAreathree.appendChild(img);
            imgAreathree.classList.add('active');
            imgAreathree.dataset.img = image.name;
        }
        reader.readAsDataURL(image);
    } else {
        alert("Image size more than 2MB");
    }
})


const selectImagefour = document.getElementById("selct-imagefour");
const inputFilefour = document.getElementById("filefour");
const imgAreafour = document.getElementById("image-areafour");

selectImagefour.addEventListener('click', function () {
    inputFilefour.click();
})

inputFilefour.addEventListener('change', function () {
    const image = this.files[0]
    if (image.size < 2000000) {
        const reader = new FileReader();
        reader.onload = () => {
            const allImg = imgAreafour.querySelectorAll('img');
            allImg.forEach(item => item.remove());
            const imgUrl = reader.result;
            const img = document.createElement('img');
            img.src = imgUrl;
            imgAreafour.appendChild(img);
            imgAreafour.classList.add('active');
            imgAreafour.dataset.img = image.name;
        }
        reader.readAsDataURL(image);
    } else {
        alert("Image size more than 2MB");
    }
})