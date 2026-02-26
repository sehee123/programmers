select id, email, first_name, last_name 
from developers d
where exists (
select 1 
from skillcodes s
where s.name in ('C#','Python')
and d.skill_code & s.code > 0
) 
order by id
;