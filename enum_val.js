var weekday;
(function (weekday) {
    weekday["SUN"] = "sunday";
    weekday["MON"] = "monday";
})(weekday || (weekday = {}));
var stringone = weekday[weekday.SUN];
console.log(stringone);
