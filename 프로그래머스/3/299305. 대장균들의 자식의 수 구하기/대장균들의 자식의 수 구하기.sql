-- 코드를 작성해주세요
select a.id ,(select count(*) from ecoli_data where parent_id = a.id) as child_count
from ecoli_data a
order by 1