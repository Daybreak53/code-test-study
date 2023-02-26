const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

rl.on("line", (line) => {
    let str = line;
    let time = 0;

    for(let i=0; i<str.length; i++){
        switch (str.charAt(i)){
            case 'A': case 'B' : case 'C' :
                time += 3;
                break;
            case 'D': case 'E' : case 'F' :
                time += 4;
                break;
            case 'G': case 'H' : case 'I' :
                time += 5;
                break;
            case 'J': case 'K' : case 'L' :
                time += 6;
                break;
            case 'M': case 'N' : case 'O' :
                time += 7;
                break;
            case 'P': case 'Q' : case 'R' : case 'S' :
                time += 8;
                break;
            case 'T': case 'U' : case 'V' :
                time += 9;
                break;
            case 'W': case 'X' : case 'Y' : case 'Z' :
                time += 10;
                break;
        }
    }
    console.log(time);

    rl.close();
}).on("close", () => {
    process.exit();
});