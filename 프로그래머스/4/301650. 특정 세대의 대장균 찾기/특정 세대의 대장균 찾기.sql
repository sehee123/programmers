-- 코드를 작성해주세요
select a.id 
from ecoli_data a 
left join ecoli_data b on b.id = a.parent_id 
left join ecoli_data c on c.id = b.parent_id
left join ecoli_data d on d.id = c.parent_id
where 1=1
and c.id is not null
and d.id is null