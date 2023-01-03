const abbreviate = (name: string): string => {
    const spaceIndex = name.indexOf(" ");
    const firstInitial = name[0];
    const lastName = name.slice(spaceIndex + 1)
    const newName = `${firstInitial}. ${lastName}`
    return newName
}

console.log(abbreviate("Alonzo Church"))