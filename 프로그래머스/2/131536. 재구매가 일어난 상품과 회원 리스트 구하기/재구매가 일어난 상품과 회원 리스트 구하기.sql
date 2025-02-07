-- 코드를 입력하세요
select user_id as USER_ID , product_id as PRODUCT_ID from (
SELECT user_id , product_id, count(*) as cnt from online_sale
where 1=1
group by user_id ,product_id 
    )
    where cnt > 1 
    order by user_id , product_id desc