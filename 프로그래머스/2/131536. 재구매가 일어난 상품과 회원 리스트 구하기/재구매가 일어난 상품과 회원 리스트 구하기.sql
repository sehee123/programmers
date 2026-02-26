-- 코드를 입력하세요
select user_id, product_id
from (
SELECT user_id, product_id , count(*) as cnt 
from online_sale
where 1=1
group by user_id, product_id
    )
    where cnt >1
order by 1,2 desc
    
