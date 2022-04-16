/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */
document.addEventListener('DOMContentLoaded', () => {

    var currentE = parseInt(document.querySelector("#currentE").innerHTML);
    var dayCount = parseInt(sessionStorage.getItem("dayCount"));
    var eScaling = 20;
    var maxE = dayCount * eScaling;
    document.querySelector("#maxE").innerHTML = dayCount;
    
    document.getElementById("1").onclick = function () {
        addEnergy(1);
    };

    setInterval(tick, 100);
    function tick() {
        if (currentE >= maxE) {
            //  block of code to be executed if the condition is true
        }
    }

    function addEnergy(amount) {
        var currentE = parseInt(document.getElementById("currentE").innerHTML);
        newCurrentE = currentE + amount;
        document.getElementById("currentE").innerHTML = newCurrentE;
    }
});

