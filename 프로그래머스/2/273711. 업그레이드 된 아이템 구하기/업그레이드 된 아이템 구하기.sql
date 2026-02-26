-- 코드를 작성해주세요
select info2.item_id,info2.item_name, info2.rarity
from item_info info 
join item_tree tree
on info.item_id = tree.parent_item_id
join item_info info2
on tree.item_id = info2.item_id
where info.rarity = "RARE"
order by item_id desc
