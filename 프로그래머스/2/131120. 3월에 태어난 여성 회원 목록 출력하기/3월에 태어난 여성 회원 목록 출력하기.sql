-- 코드를 입력하세요
SELECT member_id , member_name , gender, to_char(date_of_birth,'yyyy-mm-dd') as date_of_birth 
from member_profile 
where 1=1
and substr(to_char(date_of_birth,'yyyy-mm-dd'),6,2 ) = 03
and tlno is not null
and gender = 'W'
order by member_id 