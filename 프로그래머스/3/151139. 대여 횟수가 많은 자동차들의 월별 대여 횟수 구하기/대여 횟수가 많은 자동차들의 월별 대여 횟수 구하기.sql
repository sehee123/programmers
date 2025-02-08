-- 코드를 입력하세요
select month(b.start_date) as month , b.car_id , count(*) records
from (
        SELECT car_id 
        from car_rental_company_rental_history 
        where start_date between '2022-08-01' and '2022-10-31'
        group by car_id 
        having count(car_id) >= 5
    ) a , car_rental_company_rental_history b
    where a.car_id = b.car_id 
    and b.start_date between '2022-08-01' and '2022-10-31'
    group by month(b.start_date) , b.car_id 
    having count(*) > 0
    order by 1 , 2 desc