<html>
    <head></head>
    <body>
        <h1>Результаты поиска</h1>
        <#list products as product>
            <div>
                <p>${product.title}</p>
                <p>${product.price}</p>
                <a href="/products/product/${product.id}">Подробнее...</a>
            </div>
         </#list>
         <a href="/products/main">На главную</a>
    </body>
</html>