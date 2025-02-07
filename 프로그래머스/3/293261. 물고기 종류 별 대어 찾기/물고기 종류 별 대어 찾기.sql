-- 코드를 작성해주세요
select id , (select fish_name from fish_name_info where fish_type = a.fish_type) as fish_name , length 
from fish_info a
where 1=1
and (fish_type , length) in(
select fish_type  , max(length) as length
from fish_info
group by fish_type
)
order by id 