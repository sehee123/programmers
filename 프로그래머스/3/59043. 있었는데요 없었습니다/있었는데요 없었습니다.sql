-- 코드를 입력하세요
SELECT a.animal_id , b.name
from animal_outs a , animal_ins b
where a.animal_id = b.animal_id 
and b.datetime > a.datetime 
order by b.datetime 