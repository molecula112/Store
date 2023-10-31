<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Dota</title>
</head>
<body>
<h4>Skins<></h4>
<#list products as product>
    <div>
        <p>${product.title}</p>
        <p>${product.price}</p>
        <a href="/products/product/${product.id}">Подробнее...</a>
    </div>
</#list>
<h3>Создать новый продукт</h3>
<form action="/products/create" method="post">
    Название: <input type="text" name="title"/><br></br>
    Описание: <input type="text" name="description"/><br></br>
    Цена: <input type="number" name="price"/><br></br>
    Город: <input type="text" name="city"/><br></br>
    Автор: <input type="text" name="author"/><br></br>
    <input type="submit" value="Добавить товар"/>
</form>

</body>
</html>