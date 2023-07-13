const a=
[
    {
        "Name":"Manikandan",
        "Mobile":8610876521
    }
    ,
    {
        "Name":"Manikandan",
        "Mobile":958385933
    }
    ,
    {
        "Name":"Muthu",
        "Mobile":7348587823
    }
]
console.log("Using ForEach Loop")
var res=a.forEach(element => {
    console.log(element)
});
console.log();
console.log("Using Find function")
var res=a.find(item=>item.Name=="Manikandan")
console.log(res)
console.log();
console.log("Using Filter function")
var res=a.filter(item=>item.Name=="Manikandan")
console.log(res)
console.log("Using Map function")
var res=a.map(item=>item)
console.log(res);
