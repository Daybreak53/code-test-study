const rl = require("readline").createInterface({input: process.stdin, output: process.stdout})
let T, n;
let idx = 0;
let A = 0, B = 0;
let answer = "";

rl.on("line", (s) => {
    if(!T) {
        T = parseInt(s);
    } else {
        n = parseInt(s);
        for (let j = ~~(n / 2); j >= 2; j--) {
            let a = false;
            let b = false;

            for (let k = 2; k < j; k++) {
                if(j % k === 0) {
                    a = true;
                    break;
                }
            }

            if(a) continue;

            for (let k = 2, l = n - j; k < l; k++) {
                if(l % k === 0) {
                    b = true;
                    break;
                }
            }

            if(b) continue;

            A = j;
            B = n - j;
            break;
        }
        answer += A + " " + B + "\n";
        idx++;
        if(idx === T) {
            console.log(answer);
            rl.close();
        }
    }
}).on("close", () => {process.exit();});