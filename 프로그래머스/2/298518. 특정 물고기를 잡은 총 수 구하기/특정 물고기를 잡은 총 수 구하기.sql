-- 코드를 작성해주세요
select count(*) fish_count
from fish_info a 
where 1=1
and fish_type in (select fish_type from fish_name_info where fish_name in ('BASS','SNAPPER'))
;