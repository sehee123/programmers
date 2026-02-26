-- 코드를 입력하세요
SELECT member_id, member_name, gender, to_char(date_of_birth,'yyyy-mm-dd') date_of_birth
from member_profile
where 1=1
and gender = 'W'
and to_char(date_of_birth, 'mm') = '03' 
and tlno is not null 
order by member_id
;