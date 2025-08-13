import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-tweetretweetnoregistrado')
export class VistaTweetretweetnoregistrado extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="tweet" style="width: 100%; padding: var(--lumo-space-xl); height: 40%;"></vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="comentarios" style="width: 100%; height: 60%; padding-right: var(--lumo-space-xl); padding-left: var(--lumo-space-xl);"></vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%; align-self: center;">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 44%;"></vaadin-vertical-layout>
  <vaadin-button id="volver" style="align-self: center; width: 10%;" tabindex="0">
   Volver
  </vaadin-button>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="width: 44%;"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
