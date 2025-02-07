-- 코드를 입력하세요
SELECT count(*) as users from user_info
where 1=1
and age >= 20
and age <=29
and to_char(joined, 'yyyy')  = '2021' 
;
