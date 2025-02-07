-- 코드를 작성해주세요
select a.id , a.genotype , b.genotype as parent_genotype
from ecoli_data a left join ecoli_data b on a.parent_id = b.id
where 1=1
and a.genotype&b.genotype=b.genotype
and b.id is not null
order by a.id