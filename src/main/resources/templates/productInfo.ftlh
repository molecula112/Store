 <!DOCTYPE html>
 <html lang="en">
 <head>
     <meta charset="UTF-8">
     <title>Dota</title>
 </head>
 <body>
 <h4>Инфо о товаре<></h4>
 <p>${product.title}</p>
 <p>${product.price}</p>
 <p>${product.description}</p>
 <p>${product.city}</p>
 <p>${product.author}</p>

 <h3>Создать новый продукт</h3>
 <form action="/products/delete/${product.id}" method="post">
     <input type="submit" value="Удалить товар"/>
 </form>
 </body>
 </html>