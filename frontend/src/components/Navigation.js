import { SearchRounded, ShoppingCartOutlined } from '@material-ui/icons';
import { Badge } from '@material-ui/core';
import React from 'react';
import styled from 'styled-components';


const Container = styled.div`
   height:70px;


`;

const Wrapping = styled.div`
    padding: 10px 10px;
    display: flex;
    justify-content : space-between;
    align-items: center;
`;
const Lang = styled.span`
font-size: 15px;
cursor: pointer;
`;

const SearchBox = styled.div`
display: flex;
align-items: center;
border: 1px solid grey;
margin-left: 20px;
padding: 1px;
`;

const InputStr = styled.input`
   border: none;
`;

const SiteLogo = styled.h1`
text-align: center;
font-weight: bold;
`;

const Menu = styled.div`
font-size: 15px;
cursor: pointer;
margin-left: 20px;
`

const Left = styled.div`
display: flex;
align-items: center;
flex: 1;
`;

const Center = styled.div`
flex: 1;
`;
const Right = styled.div`
display: flex;
align-items: center;
justify-content: flex-end;
flex: 1;
`;


const Navigation = () => {
    return (
        <Container>
            <Wrapping>
                <Left>
                    <Lang>
                        EN
                    </Lang>
                    <SearchBox>
                        <InputStr />
                        <SearchRounded />
                    </SearchBox>
                </Left>
                <Center>
                    <SiteLogo>ФИЕШЪН</SiteLogo>
                </Center>
                <Right>
                    <Menu>
                        Sign Up
                    </Menu>
                    <Menu>
                        Sign In
                    </Menu>
                    <Menu>
                        <Badge badgeContent={4} color="secondary">
                            <ShoppingCartOutlined/>
                        </Badge>
                    </Menu>
                </Right>
            </Wrapping>
        </Container>
    )
}

export default Navigation
