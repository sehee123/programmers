-- 코드를 작성해주세요
select count(aa.fish_type) fish_count , max(aa.length) max_length, aa.fish_type 
from fish_info aa , (
select  avg(length) as avg , fish_type from(
    select id , fish_type 
    , case 
        when length<= 10 or length is null
        then 10 
        else length 
        end as length 
    , time
    from fish_info
    ) a
    where 1=1
    group by fish_type
    ) bb
    where aa.fish_type = bb.fish_type  
    and bb.avg >= 33
    group by aa.fish_type 
    order by aa.fish_type 
;

