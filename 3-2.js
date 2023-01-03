var abbreviate = function (name) {
    var spaceIndex = name.indexOf(" ");
    var newName = "".concat(name[0], ". ").concat(name.slice(spaceIndex + 1));
    return newName;
};
console.log(abbreviate("Alonzo Church"));
