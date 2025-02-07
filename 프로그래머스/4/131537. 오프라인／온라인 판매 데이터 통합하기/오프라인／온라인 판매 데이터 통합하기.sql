-- 코드를 입력하세요
select * from (
SELECT to_char(sales_date,'yyyy-mm-dd')as sales_date, product_id , user_id , sales_amount 
from online_sale 
where to_char(sales_date,'yyyymm') = 202203 
union all 
SELECT to_char(sales_date,'yyyy-mm-dd')as sales_date, product_id , NULL , sales_amount 
from offline_sale 
where to_char(sales_date,'yyyymm') = 202203 
)
order by sales_date  , product_id , user_id 