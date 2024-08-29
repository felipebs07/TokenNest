CREATE TABLE IF NOT EXISTS users (
  user_id BIGINT NOT NULL PRIMARY KEY,
  username VARCHAR(200) UNIQUE NOT NULL,
  email VARCHAR(150) UNIQUE NOT NULL,
  password VARCHAR(60) NOT NULL,
  created_date TIMESTAMP NOT NULL,
  updated_date TIMESTAMP,
  status CHAR(3) NOT NULL
);


CREATE TABLE IF NOT EXISTS menus (
	menu_id BIGINT NOT NULL PRIMARY key,
	menu_name VARCHAR(20)  NOT NULL,
	menu_route VARCHAR(100)  NOT NULL,
	menu_icon VARCHAR(20)
);


CREATE TABLE IF NOT EXISTS permissions_users (
  permission_id BIGINT NOT NULL PRIMARY KEY,
  user_id BIGINT NOT NULL,
  menu_id BIGINT NOT NULL,
  create_permission CHAR(3) NOT NULL,
  update_permission CHAR(3) NOT NULL,
  delete_permission CHAR(3) NOT NULL,
  read_permission CHAR(3) NOT NULL,
  custom_permission JSONB,
  created_date TIMESTAMP NOT NULL,
  updated_date TIMESTAMP,
  FOREIGN KEY (user_id) REFERENCES users(user_id),
  FOREIGN KEY (menu_id) REFERENCES menus(menu_id)
);


CREATE TABLE IF NOT EXISTS session_tokens (
  token_id BIGINT NOT NULL PRIMARY KEY,
  user_id BIGINT NOT NULL,
  token VARCHAR(255), 
  created_date TIMESTAMP NOT NULL,
  expired_date TIMESTAMP,
  ip_address VARCHAR(20),
  FOREIGN KEY (user_id) REFERENCES users(user_id)
);


CREATE TABLE IF NOT EXISTS activity_logs (
  log_id BIGINT NOT NULL PRIMARY KEY,
  user_id BIGINT,
  action_user VARCHAR(255), 
  action_date TIMESTAMP,
  ip_address VARCHAR(20),
  log_info TEXT,
  FOREIGN KEY (user_id) REFERENCES users(user_id)
);

CREATE TABLE IF NOT exists error_logs (
  log_id BIGINT NOT NULL PRIMARY KEY,
  user_id BIGINT NULL,
  error_message TEXT,
  stack_trace TEXT, 
  error_date TIMESTAMP,
  FOREIGN KEY (user_id) REFERENCES users(user_id)
);
