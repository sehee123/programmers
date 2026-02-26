-- 코드를 입력하세요
SELECT pt_name, pt_no, gend_cd, age, NVL(tlno,'NONE') as tlno
from patient 
where 1=1 
and age <= 12
and gend_cd = 'W'
order by age desc , pt_name asc
