let maiorAltura = 0;
let menorAltura = Infinity;
let somaAltMasc = 0;
let qtdMasc = 0;
let qtdFem = 0;

for (let i = 1; i <= 15; i++) {
    let altura = parseFloat(prompt(`Altura da pessoa ${i}:`));
    let genero = prompt(`Gênero da pessoa ${i} (M/F):`).toUpperCase();

    if (altura > maiorAltura) {
        maiorAltura = altura;
    }
    if (altura < menorAltura) {
        menorAltura = altura;
    }

    if (genero === 'M') {
        somaAltMasc += altura;
        qtdMasc++;
    } else if (genero === 'F') {
        qtdFem++;
    }
}

let mediaMasc = qtdMasc > 0 ? (somaAltMasc / qtdMasc) : 0;

console.log(`Maior altura: ${maiorAltura}m`);
console.log(`Menor altura: ${menorAltura}m`);
console.log(`Média masculina: ${mediaMasc.toFixed(2)}m`);
console.log(`Total de mulheres: ${qtdFem}`);

alert("Processamento concluído! Verifique o console (F12) para os detalhes.");