-- 코드를 입력하세요
SELECT round(avg(daily_fee),0) AVERAGE_FEE from car_rental_company_car 
where 1=1
and car_type = 'SUV'
;