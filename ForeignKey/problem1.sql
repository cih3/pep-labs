CREATE TABLE post(
    id SERIAL PRIMARY KEY,
    post varchar(255),
    user_fk in REFERENCES user(id)
);