select to_char(sales_date,'yyyy-mm-dd'), product_id, user_id, sales_amount from (
SELECT sales_date, product_id, user_id, sales_amount
from online_sale
where sales_date >= to_date('2022-03-01', 'yyyy-mm-dd') 
and sales_date < to_date('2022-04-01', 'yyyy-mm-dd')
union all 
SELECT sales_date, product_id, NULL, sales_amount
from offline_sale
where sales_date >= to_date('2022-03-01', 'yyyy-mm-dd') 
and sales_date < to_date('2022-04-01', 'yyyy-mm-dd')
    )
    order by sales_date, product_id , user_id
;
