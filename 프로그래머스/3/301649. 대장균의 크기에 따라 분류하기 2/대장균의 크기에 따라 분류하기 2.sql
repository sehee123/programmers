# -- 코드를 작성해주세요

select id , 
case 
    when ntile(4) over(order by size_of_colony desc) = 1 
    then 'CRITICAL'
    when ntile(4) over(order by size_of_colony desc) = 2
    then 'HIGH'
    when ntile(4) over(order by size_of_colony desc) = 3
    then 'MEDIUM'
    when ntile(4) over(order by size_of_colony desc) = 4
    then 'LOW'
    end colony_name
from ecoli_data
order by id
;
