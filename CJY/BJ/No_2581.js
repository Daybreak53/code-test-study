const rl = require("readline").createInterface({input: process.stdin, output: process.stdout});
let M, N;
let cnt = 0; // 소수의 합
let min = 0; // 최솟값인 소수

rl.on("line", (s) => {
    if(!M) {
        M = parseInt(s);
    } else {
        N = parseInt(s);
        for (let i = M; i <= N; i++) {
            let b = false;
            for (let j = 2; j < i; j++) {
                if(i % j === 0) {
                    b = true;
                    break;
                }
            }
            if(b || i === 1) continue;
            if(min === 0) min = i;
            cnt += i;
        }
        console.log(min > 0 ? cnt + "\n" + min : -1);
        rl.close();
    }
}).on("close", () => {process.exit();});