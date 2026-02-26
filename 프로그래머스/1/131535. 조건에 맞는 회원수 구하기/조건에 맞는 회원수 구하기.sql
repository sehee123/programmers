-- 코드를 입력하세요
SELECT count(user_id)
from user_info 
where 1=1 
and to_char(joined, 'yyyy') = '2021'
and age >= 20 
and age <= 29
;