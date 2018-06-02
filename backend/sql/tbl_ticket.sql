CREATE TABLE IF NOT EXISTS tbl_ticket(
  ticket_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
  ticket_start VARCHAR(20) NOT NULL,
  ticket_end VARCHAR(20) NOT NULL,
  ticket_data DATE NOT NULL ,
  ticket_time_hour INT(11) NOT NULL,
  ticket_time_minute INT(11) NOT NULL,
  ticket_amount INT(11)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


insert into tbl_ticket (ticket_id, ticket_start, ticket_end, ticket_data, ticket_time_hour, ticket_time_minute, ticket_amount)
values (1,'北京','上海','2018-06-02', 4,40, 10);
