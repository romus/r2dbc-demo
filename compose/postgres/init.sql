create table check_create_at_ret
(
    id         bigint generated by default as identity
        constraint check_create_at_ret_pkey primary key,
    created_at timestamp default now() not null,
    status     varchar(64)
);