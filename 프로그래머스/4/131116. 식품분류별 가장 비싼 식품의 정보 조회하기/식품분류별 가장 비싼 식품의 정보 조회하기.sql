-- 코드를 입력하세요
SELECT category , max(price) as max_price 
,(select product_name from food_product where category= a.category and price = max(a.price) ) as product_name
from food_product a
where category in('과자','국','김치','식용유')
group by category 
order by 2 desc
