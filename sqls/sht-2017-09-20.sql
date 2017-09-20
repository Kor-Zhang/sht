
/**
 * 修改users表的状态选项;
 * 状态:1为激活，,0为冻结,-1为删除 ,-2为注册未激活
 */
COMMENT ON COLUMN  users.status 
IS '状态:1为激活，,0为冻结,-1为删除 ,-2为注册未激活'
/**
 * 向users表添加余额字段
 */
alter table users add (money number);

UPDATE USERS
SET money = 9999

ALTER TABLE users MODIFY (money number NOT NULL )

COMMENT ON COLUMN users.MONEY
IS '用户余额'


