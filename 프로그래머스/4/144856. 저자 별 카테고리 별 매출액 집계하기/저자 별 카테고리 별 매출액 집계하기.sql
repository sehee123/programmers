-- 코드를 입력하세요
SELECT a.author_id 
, b.author_name 
, a.category
, sum(c.sales*a.price) total_sales
from book a , author b , book_sales c
where a.author_id = b.author_id 
and a.book_id = c.book_id 
and date_format(c.sales_date, '%Y%m') = '202201' 
group by a.author_id , a.category , b.author_name
order by 1 , 3 desc
;

