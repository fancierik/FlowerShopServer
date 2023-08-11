# FlowerShopServer
Более подробная информация представлена в файле FlowerPZ.docx или [вот тут](https://drive.google.com/file/d/1qSG8Xxs32uh251ATYr9qg69tuSkSNNtJ/view).
Клиентская часть представлена [здесь](https://github.com/fancierik/FlowerShopClient).

После этапа прототипирования, анализа, было разработано клиент-серверное веб-приложения онлайн покупки цветов с использованием фреймворка Angular для разработки клиентского веб-интерфейса и языка программирования Java и СУБД Postgresql для серверной части соответсвенно.

В первую очередь был создан каталог товаров, где пользователь может ознакомиться с информацией о цветах, а также, при нажатии на кнопку, добавить их в свою корзину. Выбранные позиции всегда отображаются в корзине с некоторой краткой. Данные функции доступны и для неавторизованного пользователя. Клиент может зарегистрироваться и авторизоваться. С серверной части приложение сохраняет информацию о пользователе.

Оформление заказа происходит после подтверждения пользователем состава его корзины. На форме заказа клиенту необходимо ввести данные о себе и данные для самого заказа. Он может выбрать дату заказа и способ доставки. Сразу же после оформления клиент получает результат в всплывающем окне, а также письмо с информацией о заказе на свою почту, указанную при оформлении заказа. Со стороны серверной части заказ сохраняется в базе данных и отображается на странице менеджера.

На странице менеджера реализован список заказов с полной информацией. Менеджер может изменить статус заказа или удалить его. У менеджера есть возможность просмотреть информацию о зарегистрированных пользователях. Реализован доступ к созданию заявки на добавление нового товара со стороны менеджера действующему программисту предприятия. После успешного создания заявки приходит письмо на рабочую почту магазина с информацией о товаре.

<img src="https://ie.wampi.ru/2023/08/11/MAGAZIN.jpg" />
https://ie.wampi.ru/2023/08/11/MAGAZIN.jpg
https://im.wampi.ru/2023/08/11/MENEDZER.jpg
<p align="center" >Рисунок 2.1 - Скриншот полученной страницы</p>

<img src="https://drive.google.com/uc?export=view&id=1a87nwiu7OHdnzZY8DQbHWPnMSLMOf_68" />
