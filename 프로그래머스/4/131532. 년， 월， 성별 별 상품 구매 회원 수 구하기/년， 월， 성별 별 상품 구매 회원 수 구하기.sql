-- 코드를 입력하세요
SELECT year(b.sales_date) as year , month(b.sales_date) as month , a.gender , count(distinct(a.user_id)) users
from user_info a , online_sale b 
where a.user_id = b.user_id 
and a.gender is not null 
group by year(b.sales_date) , month(b.sales_date) , a.gender
order by 1, 2, 3 
;

